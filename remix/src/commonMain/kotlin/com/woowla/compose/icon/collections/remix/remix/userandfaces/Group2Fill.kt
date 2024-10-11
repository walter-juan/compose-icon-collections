package com.woowla.compose.icon.collections.remix.remix.userandfaces

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.UserAndFacesGroup

public val UserAndFacesGroup.Group2Fill: ImageVector
    get() {
        if (_group2Fill != null) {
            return _group2Fill!!
        }
        _group2Fill = Builder(name = "Group2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 19.748f)
                verticalLineTo(16.4f)
                curveTo(10.0f, 15.117f, 10.995f, 14.108f, 12.467f, 13.532f)
                curveTo(11.543f, 13.188f, 10.543f, 13.0f, 9.5f, 13.0f)
                curveTo(7.61f, 13.0f, 5.864f, 13.617f, 4.453f, 14.66f)
                curveTo(5.332f, 17.154f, 7.413f, 19.082f, 10.0f, 19.748f)
                close()
                moveTo(18.879f, 16.086f)
                curveTo(18.486f, 15.553f, 17.171f, 15.0f, 15.5f, 15.0f)
                curveTo(13.494f, 15.0f, 12.0f, 15.797f, 12.0f, 16.4f)
                verticalLineTo(20.0f)
                curveTo(14.925f, 20.0f, 17.484f, 18.43f, 18.879f, 16.086f)
                close()
                moveTo(9.55f, 11.5f)
                curveTo(10.793f, 11.5f, 11.8f, 10.493f, 11.8f, 9.25f)
                curveTo(11.8f, 8.007f, 10.793f, 7.0f, 9.55f, 7.0f)
                curveTo(8.307f, 7.0f, 7.3f, 8.007f, 7.3f, 9.25f)
                curveTo(7.3f, 10.493f, 8.307f, 11.5f, 9.55f, 11.5f)
                close()
                moveTo(15.5f, 12.5f)
                curveTo(16.605f, 12.5f, 17.5f, 11.605f, 17.5f, 10.5f)
                curveTo(17.5f, 9.395f, 16.605f, 8.5f, 15.5f, 8.5f)
                curveTo(14.395f, 8.5f, 13.5f, 9.395f, 13.5f, 10.5f)
                curveTo(13.5f, 11.605f, 14.395f, 12.5f, 15.5f, 12.5f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _group2Fill!!
    }

private var _group2Fill: ImageVector? = null
