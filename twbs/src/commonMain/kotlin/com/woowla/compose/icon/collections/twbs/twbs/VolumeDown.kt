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

public val Twbs.VolumeDown: ImageVector
    get() {
        if (_volumeDown != null) {
            return _volumeDown!!
        }
        _volumeDown = Builder(name = "VolumeDown", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.812f, -0.39f)
                lineTo(5.825f, 5.5f)
                horizontalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 3.0f, 6.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(2.325f)
                lineToRelative(2.363f, 1.89f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 9.0f, 12.0f)
                close()
                moveTo(6.312f, 6.39f)
                lineTo(8.0f, 5.04f)
                verticalLineToRelative(5.92f)
                lineTo(6.312f, 9.61f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 6.0f, 9.5f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.312f, -0.11f)
                moveTo(12.025f, 8.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -1.318f, 3.182f)
                lineTo(10.0f, 10.475f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 11.025f, 8.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 10.0f, 5.525f)
                lineToRelative(0.707f, -0.707f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 12.025f, 8.0f)
            }
        }
        .build()
        return _volumeDown!!
    }

private var _volumeDown: ImageVector? = null
