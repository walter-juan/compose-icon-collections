package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.BootstrapFill: ImageVector
    get() {
        if (_bootstrapFill != null) {
            return _bootstrapFill!!
        }
        _bootstrapFill = Builder(name = "BootstrapFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.423f, 3.038f)
                curveTo(4.139f, 3.038f, 3.19f, 4.162f, 3.232f, 5.38f)
                curveTo(3.273f, 6.551f, 3.22f, 8.068f, 2.838f, 9.304f)
                curveTo(2.455f, 10.544f, 1.808f, 11.33f, 0.75f, 11.431f)
                verticalLineTo(12.569f)
                curveTo(1.808f, 12.67f, 2.455f, 13.456f, 2.838f, 14.696f)
                curveTo(3.22f, 15.933f, 3.273f, 17.449f, 3.232f, 18.62f)
                curveTo(3.19f, 19.838f, 4.139f, 20.962f, 5.424f, 20.962f)
                horizontalLineTo(18.578f)
                curveTo(19.862f, 20.962f, 20.812f, 19.838f, 20.77f, 18.62f)
                curveTo(20.729f, 17.449f, 20.782f, 15.933f, 21.163f, 14.696f)
                curveTo(21.546f, 13.456f, 22.192f, 12.67f, 23.25f, 12.569f)
                verticalLineTo(11.431f)
                curveTo(22.192f, 11.33f, 21.546f, 10.544f, 21.163f, 9.304f)
                curveTo(20.782f, 8.068f, 20.729f, 6.551f, 20.77f, 5.38f)
                curveTo(20.812f, 4.162f, 19.862f, 3.038f, 18.578f, 3.038f)
                horizontalLineTo(5.423f)
                horizontalLineTo(5.423f)
                close()
                moveTo(16.004f, 14.071f)
                curveTo(16.004f, 15.749f, 14.753f, 16.767f, 12.676f, 16.767f)
                horizontalLineTo(9.14f)
                curveTo(9.039f, 16.767f, 8.942f, 16.727f, 8.87f, 16.655f)
                curveTo(8.799f, 16.584f, 8.758f, 16.487f, 8.758f, 16.386f)
                verticalLineTo(7.614f)
                curveTo(8.758f, 7.513f, 8.799f, 7.416f, 8.87f, 7.345f)
                curveTo(8.942f, 7.273f, 9.039f, 7.233f, 9.14f, 7.233f)
                horizontalLineTo(12.655f)
                curveTo(14.387f, 7.233f, 15.524f, 8.171f, 15.524f, 9.612f)
                curveTo(15.524f, 10.623f, 14.759f, 11.528f, 13.785f, 11.686f)
                verticalLineTo(11.739f)
                curveTo(15.111f, 11.884f, 16.004f, 12.803f, 16.004f, 14.071f)
                close()
                moveTo(12.29f, 8.442f)
                horizontalLineTo(10.274f)
                verticalLineTo(11.29f)
                horizontalLineTo(11.972f)
                curveTo(13.285f, 11.29f, 14.008f, 10.761f, 14.008f, 9.816f)
                curveTo(14.008f, 8.931f, 13.386f, 8.442f, 12.29f, 8.442f)
                close()
                moveTo(10.274f, 12.42f)
                verticalLineTo(15.558f)
                horizontalLineTo(12.364f)
                curveTo(13.731f, 15.558f, 14.455f, 15.009f, 14.455f, 13.979f)
                curveTo(14.455f, 12.948f, 13.711f, 12.419f, 12.276f, 12.419f)
                lineTo(10.274f, 12.42f)
                close()
            }
        }
        .build()
        return _bootstrapFill!!
    }

private var _bootstrapFill: ImageVector? = null
