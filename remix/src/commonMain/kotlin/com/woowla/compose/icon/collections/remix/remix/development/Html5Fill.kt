package com.woowla.compose.icon.collections.remix.remix.development

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DevelopmentGroup

public val DevelopmentGroup.Html5Fill: ImageVector
    get() {
        if (_html5Fill != null) {
            return _html5Fill!!
        }
        _html5Fill = Builder(name = "Html5Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.178f)
                lineTo(16.619f, 16.922f)
                lineTo(17.243f, 10.144f)
                horizontalLineTo(9.026f)
                lineTo(8.822f, 7.889f)
                horizontalLineTo(17.448f)
                lineTo(17.675f, 5.678f)
                horizontalLineTo(6.325f)
                lineTo(6.961f, 12.356f)
                horizontalLineTo(14.781f)
                lineTo(14.519f, 15.222f)
                lineTo(12.0f, 15.889f)
                lineTo(9.48f, 15.222f)
                lineTo(9.322f, 13.378f)
                horizontalLineTo(7.052f)
                lineTo(7.381f, 16.922f)
                lineTo(12.0f, 18.178f)
                close()
                moveTo(3.0f, 2.0f)
                horizontalLineTo(21.0f)
                lineTo(19.377f, 20.0f)
                lineTo(12.0f, 22.0f)
                lineTo(4.623f, 20.0f)
                lineTo(3.0f, 2.0f)
                close()
            }
        }
        .build()
        return _html5Fill!!
    }

private var _html5Fill: ImageVector? = null
