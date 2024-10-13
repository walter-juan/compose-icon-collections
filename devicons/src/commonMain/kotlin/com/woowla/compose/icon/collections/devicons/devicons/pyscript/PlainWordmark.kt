package com.woowla.compose.icon.collections.devicons.devicons.pyscript

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.PyscriptGroup

public val PyscriptGroup.PlainWordmark: ImageVector
    get() {
        if (_plainWordmark != null) {
            return _plainWordmark!!
        }
        _plainWordmark = Builder(name = "PlainWordmark", defaultWidth = 128.0.dp, defaultHeight =
                128.0.dp, viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(52.15f, 48.63f)
                curveToRelative(-5.14f, 0.3f, -8.48f, 3.17f, -10.95f, 7.09f)
                verticalLineToRelative(-6.29f)
                horizontalLineToRelative(-4.73f)
                verticalLineToRelative(39.33f)
                horizontalLineToRelative(4.73f)
                verticalLineToRelative(-11.01f)
                lineToRelative(3.24f, 0.31f)
                curveToRelative(5.18f, 0.57f, 8.37f, -1.18f, 10.08f, -2.3f)
                curveToRelative(1.71f, -1.12f, 5.13f, -4.67f, 6.22f, -10.58f)
                curveToRelative(2.09f, -13.14f, -4.9f, -16.39f, -8.59f, -16.55f)
                close()
                moveTo(65.32f, 49.5f)
                lineTo(78.38f, 76.65f)
                curveToRelative(-3.95f, 9.63f, -8.01f, 9.52f, -13.53f, 8.32f)
                verticalLineToRelative(4.17f)
                curveToRelative(10.13f, 1.64f, 13.23f, -2.9f, 15.68f, -7.4f)
                curveToRelative(0.95f, -1.69f, 1.81f, -3.41f, 2.55f, -5.16f)
                lineToRelative(11.3f, -27.07f)
                horizontalLineToRelative(-4.89f)
                lineToRelative(-8.64f, 21.06f)
                lineToRelative(-10.38f, -21.06f)
                horizontalLineToRelative(-5.14f)
                horizontalLineToRelative(-0.0f)
                close()
                moveTo(31.11f, 50.25f)
                lineTo(3.61f, 63.94f)
                lineTo(31.11f, 77.69f)
                verticalLineToRelative(-4.23f)
                lineToRelative(-18.79f, -9.52f)
                lineToRelative(18.79f, -9.41f)
                verticalLineToRelative(-4.28f)
                close()
                moveTo(96.89f, 50.31f)
                verticalLineToRelative(4.28f)
                lineToRelative(18.79f, 9.41f)
                lineToRelative(-18.79f, 9.52f)
                verticalLineToRelative(4.23f)
                lineToRelative(27.5f, -13.75f)
                lineToRelative(-27.5f, -13.69f)
                close()
                moveTo(50.53f, 53.23f)
                curveToRelative(4.53f, 0.0f, 5.82f, 5.17f, 5.41f, 10.33f)
                curveToRelative(-1.13f, 8.86f, -6.8f, 12.07f, -14.75f, 9.96f)
                verticalLineToRelative(-12.14f)
                curveToRelative(2.24f, -4.22f, 6.48f, -8.15f, 9.33f, -8.15f)
                close()
            }
        }
        .build()
        return _plainWordmark!!
    }

private var _plainWordmark: ImageVector? = null
