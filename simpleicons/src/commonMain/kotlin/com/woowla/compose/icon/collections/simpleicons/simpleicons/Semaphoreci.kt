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

public val Simpleicons.Semaphoreci: ImageVector
    get() {
        if (_semaphoreci != null) {
            return _semaphoreci!!
        }
        _semaphoreci = Builder(name = "Semaphoreci", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.503f, 13.255f)
                lineToRelative(-4.158f, -4.228f)
                arcToRelative(3.038f, 3.038f, 0.0f, false, false, -4.359f, 0.0f)
                lineTo(9.694f, 12.374f)
                arcToRelative(1.207f, 1.207f, 0.0f, false, true, -1.721f, 0.0f)
                lineToRelative(-1.631f, -1.659f)
                lineToRelative(4.158f, -4.229f)
                arcToRelative(6.532f, 6.532f, 0.0f, false, true, 9.342f, 0.0f)
                lineTo(24.0f, 10.715f)
                close()
                moveTo(8.829f, 19.479f)
                arcToRelative(6.529f, 6.529f, 0.0f, false, true, -4.671f, -1.966f)
                lineTo(0.0f, 13.295f)
                lineToRelative(2.487f, -2.529f)
                lineToRelative(4.157f, 4.218f)
                arcToRelative(3.056f, 3.056f, 0.0f, false, false, 4.359f, 0.0f)
                lineToRelative(3.292f, -3.348f)
                arcToRelative(1.207f, 1.207f, 0.0f, false, true, 1.721f, 0.0f)
                lineToRelative(1.631f, 1.659f)
                lineToRelative(-4.147f, 4.229f)
                arcToRelative(6.519f, 6.519f, 0.0f, false, true, -4.671f, 1.956f)
                close()
            }
        }
        .build()
        return _semaphoreci!!
    }

private var _semaphoreci: ImageVector? = null
