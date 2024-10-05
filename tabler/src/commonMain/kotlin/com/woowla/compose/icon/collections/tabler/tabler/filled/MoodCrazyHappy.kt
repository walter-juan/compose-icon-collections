package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.MoodCrazyHappy: ImageVector
    get() {
        if (_moodCrazyHappy != null) {
            return _moodCrazyHappy!!
        }
        _moodCrazyHappy = Builder(name = "MoodCrazyHappy", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.34f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -15.0f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.995f, -8.336f)
                moveToRelative(-1.8f, 10.946f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.014f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -3.572f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.428f, 1.4f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 6.428f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.014f, -1.414f)
                moveToRelative(-7.493f, -6.493f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 1.414f)
                lineToRelative(0.792f, 0.793f)
                lineToRelative(-0.792f, 0.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 1.414f)
                lineToRelative(0.793f, -0.792f)
                lineToRelative(0.793f, 0.792f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, -1.414f)
                lineToRelative(-0.792f, -0.793f)
                lineToRelative(0.792f, -0.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.414f, -1.414f)
                lineToRelative(-0.793f, 0.792f)
                close()
                moveTo(14.707f, 7.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 1.414f)
                lineToRelative(0.792f, 0.793f)
                lineToRelative(-0.792f, 0.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 1.414f)
                lineToRelative(0.793f, -0.792f)
                lineToRelative(0.793f, 0.792f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, -1.414f)
                lineToRelative(-0.792f, -0.793f)
                lineToRelative(0.792f, -0.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.414f, -1.414f)
                lineToRelative(-0.793f, 0.792f)
                close()
            }
        }
        .build()
        return _moodCrazyHappy!!
    }

private var _moodCrazyHappy: ImageVector? = null
