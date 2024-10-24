package com.woowla.compose.icon.collections.remix.remix.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MediaGroup

public val MediaGroup.ImageCircleAiFill: ImageVector
    get() {
        if (_imageCircleAiFill != null) {
            return _imageCircleAiFill!!
        }
        _imageCircleAiFill = Builder(name = "ImageCircleAiFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.467f, 8.694f)
                lineTo(20.713f, 8.128f)
                curveTo(21.153f, 7.119f, 21.944f, 6.316f, 22.932f, 5.877f)
                lineTo(23.692f, 5.539f)
                curveTo(24.103f, 5.357f, 24.103f, 4.759f, 23.692f, 4.576f)
                lineTo(22.975f, 4.257f)
                curveTo(21.962f, 3.807f, 21.156f, 2.974f, 20.724f, 1.931f)
                lineTo(20.471f, 1.32f)
                curveTo(20.294f, 0.893f, 19.706f, 0.893f, 19.529f, 1.32f)
                lineTo(19.276f, 1.931f)
                curveTo(18.844f, 2.974f, 18.038f, 3.807f, 17.025f, 4.257f)
                lineTo(16.308f, 4.576f)
                curveTo(15.897f, 4.759f, 15.897f, 5.357f, 16.308f, 5.539f)
                lineTo(17.068f, 5.877f)
                curveTo(18.056f, 6.316f, 18.847f, 7.119f, 19.287f, 8.128f)
                lineTo(19.533f, 8.694f)
                curveTo(19.714f, 9.108f, 20.286f, 9.108f, 20.467f, 8.694f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                curveTo(2.0f, 17.523f, 6.477f, 22.0f, 12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                curveTo(22.0f, 11.597f, 21.976f, 11.2f, 21.93f, 10.809f)
                lineTo(19.944f, 11.045f)
                curveTo(19.981f, 11.358f, 20.0f, 11.677f, 20.0f, 12.0f)
                curveTo(20.0f, 12.901f, 19.851f, 13.768f, 19.576f, 14.576f)
                lineTo(15.707f, 10.707f)
                curveTo(15.317f, 10.316f, 14.684f, 10.316f, 14.293f, 10.707f)
                lineTo(6.865f, 18.135f)
                curveTo(5.114f, 16.667f, 4.0f, 14.464f, 4.0f, 12.0f)
                curveTo(4.0f, 7.582f, 7.582f, 4.0f, 12.0f, 4.0f)
                curveTo(12.692f, 4.0f, 13.362f, 4.088f, 14.0f, 4.252f)
                lineTo(14.498f, 2.315f)
                curveTo(13.699f, 2.109f, 12.861f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(9.0f, 12.0f)
                curveTo(10.105f, 12.0f, 11.0f, 11.105f, 11.0f, 10.0f)
                curveTo(11.0f, 8.895f, 10.105f, 8.0f, 9.0f, 8.0f)
                curveTo(7.895f, 8.0f, 7.0f, 8.895f, 7.0f, 10.0f)
                curveTo(7.0f, 11.105f, 7.895f, 12.0f, 9.0f, 12.0f)
                close()
            }
        }
        .build()
        return _imageCircleAiFill!!
    }

private var _imageCircleAiFill: ImageVector? = null
