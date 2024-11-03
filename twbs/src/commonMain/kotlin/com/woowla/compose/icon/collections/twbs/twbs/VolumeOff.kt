package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.VolumeOff: ImageVector
    get() {
        if (_volumeOff != null) {
            return _volumeOff!!
        }
        _volumeOff = Builder(name = "VolumeOff", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.717f, 3.55f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 11.0f, 4.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.812f, 0.39f)
                lineTo(7.825f, 10.5f)
                horizontalLineTo(5.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 5.0f, 10.0f)
                verticalLineTo(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(2.325f)
                lineToRelative(2.363f, -1.89f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.529f, -0.06f)
                moveTo(10.0f, 5.04f)
                lineTo(8.312f, 6.39f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 6.5f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.312f, 0.11f)
                lineTo(10.0f, 10.96f)
                close()
            }
        }
        .build()
        return _volumeOff!!
    }

private var _volumeOff: ImageVector? = null
