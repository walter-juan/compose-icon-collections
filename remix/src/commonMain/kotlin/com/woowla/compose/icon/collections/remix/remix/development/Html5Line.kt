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

public val DevelopmentGroup.Html5Line: ImageVector
    get() {
        if (_html5Line != null) {
            return _html5Line!!
        }
        _html5Line = Builder(name = "Html5Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.178f)
                lineTo(7.381f, 16.922f)
                lineTo(7.052f, 13.378f)
                horizontalLineTo(9.322f)
                lineTo(9.48f, 15.222f)
                lineTo(12.0f, 15.889f)
                lineTo(14.519f, 15.222f)
                lineTo(14.781f, 12.356f)
                horizontalLineTo(6.961f)
                lineTo(6.325f, 5.678f)
                horizontalLineTo(17.675f)
                lineTo(17.448f, 7.889f)
                horizontalLineTo(8.822f)
                lineTo(9.026f, 10.144f)
                horizontalLineTo(17.243f)
                lineTo(16.619f, 16.922f)
                lineTo(12.0f, 18.178f)
                close()
                moveTo(3.0f, 2.0f)
                horizontalLineTo(21.0f)
                lineTo(19.377f, 20.0f)
                lineTo(12.0f, 22.0f)
                lineTo(4.623f, 20.0f)
                lineTo(3.0f, 2.0f)
                close()
                moveTo(5.188f, 4.0f)
                lineTo(6.49f, 18.434f)
                lineTo(12.0f, 19.928f)
                lineTo(17.51f, 18.434f)
                lineTo(18.812f, 4.0f)
                horizontalLineTo(5.188f)
                close()
            }
        }
        .build()
        return _html5Line!!
    }

private var _html5Line: ImageVector? = null
