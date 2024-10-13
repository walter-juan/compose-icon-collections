package com.woowla.compose.icon.collections.devicons.devicons.elm

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.ElmGroup

public val ElmGroup.PlainWordmark: ImageVector
    get() {
        if (_plainWordmark != null) {
            return _plainWordmark!!
        }
        _plainWordmark = Builder(name = "PlainWordmark", defaultWidth = 128.0.dp, defaultHeight =
                128.0.dp, viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF34495e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.29f, 62.59f)
                lineToRelative(11.15f, -11.15f)
                horizontalLineToRelative(-22.3f)
                lineToRelative(11.15f, 11.15f)
                close()
                moveTo(2.92f, 38.21f)
                lineToRelative(11.22f, 11.23f)
                horizontalLineToRelative(24.41f)
                lineTo(27.32f, 38.21f)
                horizontalLineTo(2.92f)
                close()
                moveTo(28.7f, 63.99f)
                lineToRelative(12.2f, -12.2f)
                lineToRelative(12.15f, 12.15f)
                lineToRelative(-12.2f, 12.2f)
                close()
                moveTo(53.08f, 61.14f)
                verticalLineTo(38.21f)
                horizontalLineTo(30.15f)
                lineToRelative(22.93f, 22.93f)
                close()
                moveTo(25.87f, 64.0f)
                lineTo(1.5f, 39.63f)
                verticalLineToRelative(48.74f)
                lineTo(25.87f, 64.0f)
                close()
                moveTo(42.27f, 77.56f)
                lineToRelative(10.81f, 10.81f)
                verticalLineTo(66.75f)
                lineTo(42.27f, 77.56f)
                close()
                moveTo(27.29f, 65.42f)
                lineTo(2.92f, 89.79f)
                horizontalLineToRelative(48.74f)
                lineTo(27.29f, 65.42f)
                close()
                moveTo(62.74f, 50.22f)
                horizontalLineToRelative(16.7f)
                verticalLineToRelative(3.09f)
                horizontalLineToRelative(-13.0f)
                verticalLineToRelative(9.1f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(3.14f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(10.52f)
                horizontalLineToRelative(13.44f)
                verticalLineToRelative(3.13f)
                horizontalLineTo(62.74f)
                close()
                moveTo(85.58f, 47.74f)
                horizontalLineToRelative(3.62f)
                verticalLineToRelative(27.4f)
                curveToRelative(0.0f, 1.15f, 0.49f, 1.59f, 1.0f, 1.59f)
                arcToRelative(3.08f, 3.08f, 0.0f, false, false, 0.8f, -0.09f)
                lineToRelative(0.49f, 2.74f)
                arcToRelative(4.89f, 4.89f, 0.0f, false, true, -2.08f, 0.35f)
                curveToRelative(-2.74f, 0.0f, -3.84f, -1.72f, -3.84f, -4.86f)
                close()
                moveTo(96.85f, 57.73f)
                horizontalLineToRelative(3.0f)
                lineToRelative(0.31f, 3.09f)
                horizontalLineToRelative(0.13f)
                curveToRelative(1.86f, -2.0f, 4.11f, -3.62f, 6.67f, -3.62f)
                curveToRelative(3.27f, 0.0f, 5.0f, 1.55f, 5.92f, 4.11f)
                curveToRelative(2.25f, -2.43f, 4.46f, -4.11f, 7.07f, -4.11f)
                curveToRelative(4.42f, 0.0f, 6.54f, 2.92f, 6.54f, 8.39f)
                verticalLineTo(79.2f)
                horizontalLineToRelative(-3.62f)
                verticalLineTo(66.08f)
                curveToRelative(0.0f, -4.0f, -1.28f, -5.74f, -4.0f, -5.74f)
                curveToRelative(-1.68f, 0.0f, -3.4f, 1.11f, -5.39f, 3.31f)
                verticalLineTo(79.2f)
                horizontalLineToRelative(-3.62f)
                verticalLineTo(66.08f)
                curveToRelative(0.0f, -4.0f, -1.28f, -5.74f, -4.0f, -5.74f)
                curveToRelative(-1.59f, 0.0f, -3.4f, 1.11f, -5.39f, 3.31f)
                verticalLineTo(79.2f)
                horizontalLineToRelative(-3.62f)
                close()
            }
        }
        .build()
        return _plainWordmark!!
    }

private var _plainWordmark: ImageVector? = null
