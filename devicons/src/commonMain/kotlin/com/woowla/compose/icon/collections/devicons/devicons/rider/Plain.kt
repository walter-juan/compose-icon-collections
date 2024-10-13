package com.woowla.compose.icon.collections.devicons.devicons.rider

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.RiderGroup

public val RiderGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFdd1265)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.47f, 5.34f)
                lineTo(5.49f, 28.9f)
                lineToRelative(13.01f, 80.37f)
                lineToRelative(33.55f, 12.9f)
                lineToRelative(14.03f, -11.4f)
                lineTo(88.1f, 122.37f)
                lineToRelative(34.41f, -20.1f)
                lineToRelative(-13.01f, -27.81f)
                lineToRelative(13.01f, -23.58f)
                lineToRelative(-21.44f, -11.9f)
                verticalLineToRelative(62.1f)
                lineTo(26.93f, 101.07f)
                lineTo(26.93f, 26.93f)
                horizontalLineToRelative(60.65f)
                lineTo(79.51f, 7.18f)
                lineTo(66.63f, 19.86f)
                lineTo(40.47f, 5.34f)
                close()
                moveTo(27.93f, 27.93f)
                verticalLineToRelative(72.14f)
                horizontalLineToRelative(72.14f)
                lineTo(100.07f, 27.93f)
                lineTo(27.93f, 27.93f)
                close()
                moveTo(36.57f, 36.47f)
                horizontalLineToRelative(12.56f)
                arcToRelative(10.97f, 10.97f, 0.0f, false, true, 8.01f, 2.79f)
                arcToRelative(8.63f, 8.63f, 0.0f, false, true, 2.37f, 6.29f)
                verticalLineToRelative(0.07f)
                arcToRelative(8.53f, 8.53f, 0.0f, false, true, -5.9f, 8.53f)
                lineToRelative(6.73f, 9.83f)
                horizontalLineToRelative(-7.08f)
                lineToRelative(-5.89f, -8.8f)
                horizontalLineToRelative(-4.69f)
                verticalLineToRelative(8.8f)
                horizontalLineToRelative(-6.1f)
                lineToRelative(-0.0f, -27.51f)
                close()
                moveTo(64.52f, 36.47f)
                horizontalLineToRelative(10.73f)
                curveToRelative(8.64f, 0.0f, 14.63f, 5.94f, 14.63f, 13.68f)
                verticalLineToRelative(0.08f)
                curveToRelative(0.0f, 7.74f, -5.97f, 13.75f, -14.63f, 13.75f)
                lineTo(64.52f, 63.99f)
                lineTo(64.52f, 36.47f)
                close()
                moveTo(75.3f, 41.92f)
                lineToRelative(-4.68f, 0.01f)
                verticalLineToRelative(16.58f)
                lineTo(75.3f, 58.51f)
                arcToRelative(7.84f, 7.84f, 0.0f, false, false, 8.29f, -8.22f)
                verticalLineToRelative(-0.07f)
                arcToRelative(7.91f, 7.91f, 0.0f, false, false, -8.29f, -8.3f)
                close()
                moveTo(42.67f, 41.98f)
                verticalLineToRelative(7.9f)
                lineToRelative(6.09f, 0.0f)
                curveToRelative(2.95f, 0.0f, 4.64f, -1.58f, 4.64f, -3.89f)
                verticalLineToRelative(-0.07f)
                curveToRelative(0.0f, -2.6f, -1.8f, -3.94f, -4.75f, -3.94f)
                horizontalLineToRelative(-5.98f)
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
