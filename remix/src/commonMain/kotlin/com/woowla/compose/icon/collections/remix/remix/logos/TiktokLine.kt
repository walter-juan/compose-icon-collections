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

public val LogosGroup.TiktokLine: ImageVector
    get() {
        if (_tiktokLine != null) {
            return _tiktokLine!!
        }
        _tiktokLine = Builder(name = "TiktokLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                verticalLineTo(8.414f)
                curveTo(10.595f, 8.339f, 10.177f, 8.3f, 9.75f, 8.3f)
                curveTo(5.967f, 8.3f, 2.9f, 11.367f, 2.9f, 15.15f)
                curveTo(2.9f, 18.933f, 5.967f, 22.0f, 9.75f, 22.0f)
                curveTo(13.533f, 22.0f, 16.6f, 18.933f, 16.6f, 15.15f)
                verticalLineTo(11.414f)
                curveTo(17.637f, 11.854f, 18.766f, 12.1f, 20.0f, 12.1f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.5f)
                horizontalLineTo(20.0f)
                curveTo(18.097f, 6.5f, 16.6f, 4.963f, 16.6f, 3.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(13.0f, 4.0f)
                horizontalLineTo(14.688f)
                curveTo(15.082f, 6.22f, 16.767f, 7.996f, 19.0f, 8.409f)
                verticalLineTo(10.028f)
                curveTo(17.962f, 9.876f, 17.025f, 9.486f, 16.157f, 8.905f)
                lineTo(14.6f, 7.863f)
                verticalLineTo(15.15f)
                curveTo(14.6f, 17.829f, 12.429f, 20.0f, 9.75f, 20.0f)
                curveTo(7.072f, 20.0f, 4.9f, 17.829f, 4.9f, 15.15f)
                curveTo(4.9f, 12.471f, 7.072f, 10.3f, 9.75f, 10.3f)
                curveTo(9.834f, 10.3f, 9.918f, 10.302f, 10.0f, 10.306f)
                verticalLineTo(11.91f)
                curveTo(9.918f, 11.903f, 9.835f, 11.9f, 9.75f, 11.9f)
                curveTo(7.955f, 11.9f, 6.5f, 13.355f, 6.5f, 15.15f)
                curveTo(6.5f, 16.945f, 7.955f, 18.4f, 9.75f, 18.4f)
                curveTo(11.545f, 18.4f, 13.0f, 16.945f, 13.0f, 15.15f)
                curveTo(13.0f, 11.433f, 12.999f, 7.717f, 13.0f, 4.0f)
                close()
                moveTo(8.5f, 15.15f)
                curveTo(8.5f, 14.46f, 9.06f, 13.9f, 9.75f, 13.9f)
                curveTo(10.441f, 13.9f, 11.0f, 14.46f, 11.0f, 15.15f)
                curveTo(11.0f, 15.84f, 10.441f, 16.4f, 9.75f, 16.4f)
                curveTo(9.06f, 16.4f, 8.5f, 15.84f, 8.5f, 15.15f)
                close()
            }
        }
        .build()
        return _tiktokLine!!
    }

private var _tiktokLine: ImageVector? = null
