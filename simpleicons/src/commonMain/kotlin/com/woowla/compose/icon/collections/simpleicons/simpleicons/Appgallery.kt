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

public val Simpleicons.Appgallery: ImageVector
    get() {
        if (_appgallery != null) {
            return _appgallery!!
        }
        _appgallery = Builder(name = "Appgallery", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.734f, 0.0f)
                curveTo(1.804f, 0.0f, 0.0f, 1.803f, 0.0f, 6.733f)
                verticalLineToRelative(10.535f)
                curveTo(0.0f, 22.198f, 1.803f, 24.0f, 6.734f, 24.0f)
                horizontalLineToRelative(10.529f)
                curveTo(22.193f, 24.0f, 24.0f, 22.197f, 24.0f, 17.268f)
                lineTo(24.0f, 6.733f)
                curveTo(24.0f, 1.803f, 22.197f, 0.0f, 17.266f, 0.0f)
                close()
                moveTo(8.0f, 4.0f)
                horizontalLineToRelative(0.565f)
                arcTo(3.439f, 3.439f, 0.0f, false, false, 12.0f, 7.435f)
                arcTo(3.439f, 3.439f, 0.0f, false, false, 15.435f, 4.0f)
                lineTo(16.0f, 4.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveTo(8.0f, 6.206f, 8.0f, 4.0f)
                close()
                moveTo(14.468f, 12.0f)
                horizontalLineToRelative(0.52f)
                lineToRelative(0.713f, 2.16f)
                lineToRelative(0.696f, -2.158f)
                horizontalLineToRelative(0.66f)
                lineToRelative(-1.092f, 3.14f)
                horizontalLineToRelative(-0.532f)
                lineToRelative(-0.714f, -2.063f)
                lineToRelative(-0.714f, 2.063f)
                horizontalLineToRelative(-0.528f)
                lineToRelative(-1.095f, -3.14f)
                horizontalLineToRelative(0.678f)
                lineToRelative(0.694f, 2.158f)
                close()
                moveTo(20.704f, 12.0f)
                horizontalLineToRelative(0.629f)
                verticalLineToRelative(3.138f)
                horizontalLineToRelative(-0.629f)
                close()
                moveTo(2.666f, 12.0f)
                horizontalLineToRelative(0.638f)
                verticalLineToRelative(1.267f)
                horizontalLineToRelative(1.439f)
                lineTo(4.743f, 12.0f)
                horizontalLineToRelative(0.637f)
                verticalLineToRelative(3.142f)
                horizontalLineToRelative(-0.637f)
                verticalLineToRelative(-1.276f)
                horizontalLineToRelative(-1.44f)
                verticalLineToRelative(1.276f)
                horizontalLineToRelative(-0.637f)
                close()
                moveTo(8.334f, 12.0f)
                horizontalLineToRelative(0.637f)
                verticalLineToRelative(1.772f)
                curveToRelative(0.0f, 0.9f, -0.496f, 1.417f, -1.36f, 1.417f)
                curveToRelative(-0.856f, 0.0f, -1.347f, -0.507f, -1.347f, -1.39f)
                verticalLineToRelative(-1.797f)
                lineTo(6.9f, 12.002f)
                verticalLineToRelative(1.775f)
                curveToRelative(0.0f, 0.524f, 0.255f, 0.805f, 0.719f, 0.805f)
                curveToRelative(0.46f, 0.0f, 0.714f, -0.273f, 0.714f, -0.784f)
                close()
                moveTo(10.678f, 12.0f)
                horizontalLineToRelative(0.563f)
                lineToRelative(1.378f, 3.14f)
                horizontalLineToRelative(-0.668f)
                lineToRelative(-0.282f, -0.654f)
                lineTo(10.23f, 14.486f)
                lineToRelative(-0.286f, 0.654f)
                horizontalLineToRelative(-0.651f)
                close()
                moveTo(17.571f, 12.002f)
                horizontalLineToRelative(2.312f)
                verticalLineToRelative(0.572f)
                lineTo(18.2f, 12.574f)
                verticalLineToRelative(0.643f)
                horizontalLineToRelative(1.16f)
                verticalLineToRelative(0.573f)
                lineTo(18.2f, 13.79f)
                verticalLineToRelative(0.777f)
                horizontalLineToRelative(1.744f)
                verticalLineToRelative(0.573f)
                lineTo(17.57f, 15.14f)
                close()
                moveTo(10.948f, 12.795f)
                lineTo(10.468f, 13.919f)
                horizontalLineToRelative(0.964f)
                close()
            }
        }
        .build()
        return _appgallery!!
    }

private var _appgallery: ImageVector? = null
