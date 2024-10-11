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

public val DevelopmentGroup.Css3Line: ImageVector
    get() {
        if (_css3Line != null) {
            return _css3Line!!
        }
        _css3Line = Builder(name = "Css3Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.8f, 14.0f)
                horizontalLineTo(4.84f)
                lineTo(4.295f, 16.725f)
                lineTo(10.039f, 18.879f)
                lineTo(17.267f, 16.47f)
                lineTo(18.36f, 11.0f)
                horizontalLineTo(3.4f)
                lineTo(3.8f, 9.0f)
                horizontalLineTo(18.76f)
                lineTo(19.56f, 5.0f)
                horizontalLineTo(4.6f)
                lineTo(5.0f, 3.0f)
                horizontalLineTo(22.0f)
                lineTo(19.0f, 18.0f)
                lineTo(10.0f, 21.0f)
                lineTo(2.0f, 18.0f)
                lineTo(2.8f, 14.0f)
                close()
            }
        }
        .build()
        return _css3Line!!
    }

private var _css3Line: ImageVector? = null
