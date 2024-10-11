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

public val UserAndFacesGroup.MickeyFill: ImageVector
    get() {
        if (_mickeyFill != null) {
            return _mickeyFill!!
        }
        _mickeyFill = Builder(name = "MickeyFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 2.0f)
                curveTo(20.985f, 2.0f, 23.0f, 4.015f, 23.0f, 6.5f)
                curveTo(23.0f, 8.683f, 21.445f, 10.503f, 19.383f, 10.913f)
                curveTo(19.78f, 11.862f, 20.0f, 12.906f, 20.0f, 14.0f)
                curveTo(20.0f, 18.418f, 16.418f, 22.0f, 12.0f, 22.0f)
                curveTo(7.582f, 22.0f, 4.0f, 18.418f, 4.0f, 14.0f)
                curveTo(4.0f, 12.906f, 4.22f, 11.862f, 4.618f, 10.912f)
                curveTo(2.555f, 10.503f, 1.0f, 8.683f, 1.0f, 6.5f)
                curveTo(1.0f, 4.015f, 3.015f, 2.0f, 5.5f, 2.0f)
                curveTo(7.903f, 2.0f, 9.866f, 3.883f, 9.993f, 6.254f)
                curveTo(10.635f, 6.088f, 11.307f, 6.0f, 12.0f, 6.0f)
                curveTo(12.693f, 6.0f, 13.365f, 6.088f, 14.006f, 6.254f)
                curveTo(14.134f, 3.883f, 16.097f, 2.0f, 18.5f, 2.0f)
                close()
            }
        }
        .build()
        return _mickeyFill!!
    }

private var _mickeyFill: ImageVector? = null
