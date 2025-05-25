package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Antennapod: ImageVector
    get() {
        if (_antennapod != null) {
            return _antennapod!!
        }
        _antennapod = Builder(name = "Antennapod", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.188f, 10.98f)
                lineToRelative(3.339f, -9.459f)
                arcToRelative(2.118f, 2.118f, 0.0f, true, true, 2.946f, 0.0f)
                lineToRelative(3.339f, 9.46f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 24.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                moveToRelative(0.0f, 2.824f)
                arcToRelative(9.177f, 9.177f, 0.0f, false, true, 4.969f, 16.892f)
                lineToRelative(-0.486f, -1.376f)
                arcToRelative(7.765f, 7.765f, 0.0f, true, false, -8.967f, 0.0f)
                lineToRelative(-0.485f, 1.376f)
                arcTo(9.177f, 9.177f, 0.0f, false, true, 12.0f, 2.824f)
                moveToRelative(0.0f, 3.529f)
                arcToRelative(5.647f, 5.647f, 0.0f, false, true, 3.739f, 9.879f)
                lineToRelative(-0.521f, -1.478f)
                arcToRelative(4.235f, 4.235f, 0.0f, true, false, -6.436f, 0.0f)
                lineToRelative(-0.522f, 1.478f)
                arcTo(5.647f, 5.647f, 0.0f, false, true, 12.0f, 6.353f)
                moveToRelative(0.0f, 8.298f)
                lineToRelative(-1.618f, 4.584f)
                arcToRelative(7.4f, 7.4f, 0.0f, false, false, 3.236f, 0.0f)
                close()
                moveTo(9.79f, 20.909f)
                lineTo(8.853f, 23.565f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 3.146f, -0.435f)
                lineToRelative(-0.937f, -2.656f)
                arcToRelative(9.2f, 9.2f, 0.0f, false, true, -2.209f, 0.267f)
                arcToRelative(9.2f, 9.2f, 0.0f, false, true, -2.21f, -0.267f)
            }
        }
        .build()
        return _antennapod!!
    }

private var _antennapod: ImageVector? = null
