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

public val MediaGroup.PlayReverseLine: ImageVector
    get() {
        if (_playReverseLine != null) {
            return _playReverseLine!!
        }
        _playReverseLine = Builder(name = "PlayReverseLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.606f, 12.0f)
                lineTo(14.0f, 7.737f)
                verticalLineTo(16.263f)
                lineTo(7.606f, 12.0f)
                close()
                moveTo(4.624f, 12.416f)
                lineTo(15.223f, 19.482f)
                curveTo(15.452f, 19.635f, 15.763f, 19.573f, 15.916f, 19.343f)
                curveTo(15.971f, 19.261f, 16.0f, 19.164f, 16.0f, 19.066f)
                verticalLineTo(4.934f)
                curveTo(16.0f, 4.658f, 15.776f, 4.434f, 15.5f, 4.434f)
                curveTo(15.401f, 4.434f, 15.305f, 4.464f, 15.223f, 4.518f)
                lineTo(4.624f, 11.584f)
                curveTo(4.394f, 11.737f, 4.332f, 12.048f, 4.485f, 12.277f)
                curveTo(4.522f, 12.332f, 4.569f, 12.38f, 4.624f, 12.416f)
                close()
            }
        }
        .build()
        return _playReverseLine!!
    }

private var _playReverseLine: ImageVector? = null
