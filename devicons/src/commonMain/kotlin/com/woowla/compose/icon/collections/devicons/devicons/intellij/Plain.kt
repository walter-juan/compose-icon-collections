package com.woowla.compose.icon.collections.devicons.devicons.intellij

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.IntellijGroup

public val IntellijGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF087cfa)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.91f, 5.48f)
                lineTo(4.96f, 51.85f)
                lineToRelative(11.45f, 3.83f)
                lineTo(6.28f, 74.43f)
                lineTo(23.49f, 88.03f)
                lineToRelative(-1.58f, 5.3f)
                lineToRelative(-7.51f, 26.29f)
                lineToRelative(35.85f, -12.96f)
                lineToRelative(24.55f, 15.85f)
                lineToRelative(45.08f, -18.06f)
                lineToRelative(2.11f, -67.78f)
                lineToRelative(-20.92f, 20.41f)
                verticalLineToRelative(43.98f)
                lineTo(26.93f, 101.07f)
                lineTo(26.93f, 26.93f)
                horizontalLineToRelative(74.14f)
                verticalLineToRelative(30.15f)
                lineToRelative(20.92f, -20.4f)
                lineTo(85.18f, 7.4f)
                lineTo(71.04f, 23.3f)
                lineToRelative(-10.83f, -13.29f)
                lineToRelative(-38.3f, -4.52f)
                close()
                moveTo(27.93f, 27.93f)
                verticalLineToRelative(72.14f)
                horizontalLineToRelative(72.14f)
                lineTo(100.07f, 27.93f)
                lineTo(27.93f, 27.93f)
                close()
                moveTo(66.81f, 36.57f)
                horizontalLineToRelative(6.09f)
                verticalLineToRelative(17.86f)
                arcToRelative(12.38f, 12.38f, 0.0f, false, true, -0.67f, 4.25f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, true, -4.96f, 4.88f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -4.04f, 0.63f)
                lineToRelative(0.09f, 0.05f)
                arcToRelative(10.8f, 10.8f, 0.0f, false, true, -5.35f, -1.22f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, true, -3.56f, -2.88f)
                lineToRelative(3.77f, -4.21f)
                curveToRelative(0.69f, 0.78f, 1.48f, 1.45f, 2.37f, 2.0f)
                arcToRelative(4.85f, 4.85f, 0.0f, false, false, 2.62f, 0.73f)
                arcToRelative(3.46f, 3.46f, 0.0f, false, false, 2.67f, -1.06f)
                arcToRelative(5.07f, 5.07f, 0.0f, false, false, 0.98f, -3.45f)
                lineTo(66.81f, 36.57f)
                close()
                moveTo(36.6f, 36.6f)
                horizontalLineToRelative(13.64f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-3.82f)
                verticalLineToRelative(17.26f)
                horizontalLineToRelative(3.82f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-13.64f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.82f)
                lineTo(40.42f, 41.59f)
                horizontalLineToRelative(-3.82f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(36.55f, 86.75f)
                horizontalLineToRelative(27.43f)
                verticalLineToRelative(4.57f)
                horizontalLineToRelative(-27.43f)
                verticalLineToRelative(-4.57f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
