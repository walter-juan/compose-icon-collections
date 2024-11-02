package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Liquibase: ImageVector
    get() {
        if (_liquibase != null) {
            return _liquibase!!
        }
        _liquibase = Builder(name = "Liquibase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.019f, 0.0f)
                curveTo(6.65f, 0.0f, 2.966f, 1.922f, 2.965f, 3.646f)
                curveToRelative(0.0f, 1.723f, 3.727f, 3.646f, 9.056f, 3.646f)
                curveToRelative(5.328f, 0.0f, 9.054f, -1.922f, 9.054f, -3.646f)
                reflectiveCurveTo(17.347f, 0.0f, 12.019f, 0.0f)
                close()
                moveTo(21.075f, 6.451f)
                curveToRelative(-1.602f, 1.283f, -3.486f, 1.723f, -7.332f, 2.644f)
                curveToRelative(-5.329f, 1.242f, -10.817f, 2.524f, -10.817f, 7.532f)
                verticalLineToRelative(0.56f)
                curveToRelative(2.003f, -1.723f, 5.608f, -2.523f, 9.134f, -3.324f)
                horizontalLineToRelative(0.002f)
                curveToRelative(4.407f, -1.002f, 9.013f, -2.044f, 9.013f, -4.607f)
                close()
                moveTo(21.075f, 12.3f)
                curveToRelative(-1.923f, 1.563f, -5.328f, 2.324f, -8.694f, 3.085f)
                curveToRelative(-4.647f, 1.042f, -9.455f, 2.123f, -9.455f, 5.007f)
                curveToRelative(0.0f, 0.642f, 0.521f, 1.323f, 1.483f, 1.924f)
                curveToRelative(1.924f, -1.282f, 4.928f, -2.003f, 7.812f, -2.684f)
                curveToRelative(4.367f, -1.041f, 8.854f, -2.123f, 8.854f, -4.807f)
                close()
                moveTo(21.075f, 17.949f)
                curveToRelative(-1.883f, 1.602f, -5.249f, 2.405f, -8.494f, 3.165f)
                curveToRelative(-2.364f, 0.562f, -4.768f, 1.122f, -6.451f, 1.963f)
                curveTo(7.653f, 23.64f, 9.696f, 24.0f, 12.02f, 24.0f)
                curveToRelative(5.288f, 0.0f, 9.054f, -1.885f, 9.054f, -3.647f)
                close()
            }
        }
        .build()
        return _liquibase!!
    }

private var _liquibase: ImageVector? = null
