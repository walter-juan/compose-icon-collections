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

public val UserAndFacesGroup.MickeyLine: ImageVector
    get() {
        if (_mickeyLine != null) {
            return _mickeyLine!!
        }
        _mickeyLine = Builder(name = "MickeyLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.617f, 10.913f)
                curveTo(2.555f, 10.503f, 1.0f, 8.683f, 1.0f, 6.5f)
                curveTo(1.0f, 4.015f, 3.015f, 2.0f, 5.5f, 2.0f)
                curveTo(7.903f, 2.0f, 9.866f, 3.883f, 9.993f, 6.254f)
                curveTo(10.635f, 6.088f, 11.307f, 6.0f, 12.0f, 6.0f)
                curveTo(12.693f, 6.0f, 13.365f, 6.088f, 14.007f, 6.254f)
                curveTo(14.134f, 3.883f, 16.097f, 2.0f, 18.5f, 2.0f)
                curveTo(20.985f, 2.0f, 23.0f, 4.015f, 23.0f, 6.5f)
                curveTo(23.0f, 8.683f, 21.445f, 10.503f, 19.383f, 10.913f)
                curveTo(19.78f, 11.863f, 20.0f, 12.906f, 20.0f, 14.0f)
                curveTo(20.0f, 18.418f, 16.418f, 22.0f, 12.0f, 22.0f)
                curveTo(7.582f, 22.0f, 4.0f, 18.418f, 4.0f, 14.0f)
                curveTo(4.0f, 12.906f, 4.22f, 11.863f, 4.617f, 10.913f)
                close()
                moveTo(3.0f, 6.5f)
                curveTo(3.0f, 7.881f, 4.119f, 9.0f, 5.5f, 9.0f)
                curveTo(5.59f, 9.0f, 5.679f, 8.995f, 5.766f, 8.986f)
                curveTo(6.366f, 8.241f, 7.097f, 7.606f, 7.924f, 7.115f)
                curveTo(7.974f, 6.918f, 8.0f, 6.712f, 8.0f, 6.5f)
                curveTo(8.0f, 5.119f, 6.881f, 4.0f, 5.5f, 4.0f)
                curveTo(4.119f, 4.0f, 3.0f, 5.119f, 3.0f, 6.5f)
                close()
                moveTo(18.234f, 8.986f)
                curveTo(18.322f, 8.995f, 18.41f, 9.0f, 18.5f, 9.0f)
                curveTo(19.881f, 9.0f, 21.0f, 7.881f, 21.0f, 6.5f)
                curveTo(21.0f, 5.119f, 19.881f, 4.0f, 18.5f, 4.0f)
                curveTo(17.119f, 4.0f, 16.0f, 5.119f, 16.0f, 6.5f)
                curveTo(16.0f, 6.712f, 16.026f, 6.918f, 16.076f, 7.115f)
                curveTo(16.903f, 7.606f, 17.634f, 8.241f, 18.234f, 8.986f)
                close()
                moveTo(6.0f, 14.0f)
                curveTo(6.0f, 17.314f, 8.686f, 20.0f, 12.0f, 20.0f)
                curveTo(15.314f, 20.0f, 18.0f, 17.314f, 18.0f, 14.0f)
                curveTo(18.0f, 10.686f, 15.314f, 8.0f, 12.0f, 8.0f)
                curveTo(8.686f, 8.0f, 6.0f, 10.686f, 6.0f, 14.0f)
                close()
            }
        }
        .build()
        return _mickeyLine!!
    }

private var _mickeyLine: ImageVector? = null
