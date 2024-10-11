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

public val MediaGroup.EjectLine: ImageVector
    get() {
        if (_ejectLine != null) {
            return _ejectLine!!
        }
        _ejectLine = Builder(name = "EjectLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.737f, 13.0f)
                horizontalLineTo(16.263f)
                lineTo(12.0f, 6.606f)
                lineTo(7.737f, 13.0f)
                close()
                moveTo(12.416f, 3.624f)
                lineTo(19.482f, 14.223f)
                curveTo(19.635f, 14.452f, 19.573f, 14.763f, 19.343f, 14.916f)
                curveTo(19.261f, 14.971f, 19.164f, 15.0f, 19.066f, 15.0f)
                horizontalLineTo(4.934f)
                curveTo(4.658f, 15.0f, 4.434f, 14.776f, 4.434f, 14.5f)
                curveTo(4.434f, 14.401f, 4.463f, 14.305f, 4.518f, 14.223f)
                lineTo(11.584f, 3.624f)
                curveTo(11.737f, 3.394f, 12.048f, 3.332f, 12.277f, 3.485f)
                curveTo(12.332f, 3.522f, 12.379f, 3.569f, 12.416f, 3.624f)
                close()
                moveTo(5.0f, 17.0f)
                horizontalLineTo(19.0f)
                curveTo(19.552f, 17.0f, 20.0f, 17.448f, 20.0f, 18.0f)
                curveTo(20.0f, 18.552f, 19.552f, 19.0f, 19.0f, 19.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 19.0f, 4.0f, 18.552f, 4.0f, 18.0f)
                curveTo(4.0f, 17.448f, 4.448f, 17.0f, 5.0f, 17.0f)
                close()
            }
        }
        .build()
        return _ejectLine!!
    }

private var _ejectLine: ImageVector? = null
