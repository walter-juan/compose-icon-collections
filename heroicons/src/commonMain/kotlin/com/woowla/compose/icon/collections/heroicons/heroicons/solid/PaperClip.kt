package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.PaperClip: ImageVector
    get() {
        if (_paperClip != null) {
            return _paperClip!!
        }
        _paperClip = Builder(name = "PaperClip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.97f, 3.659f)
                curveTo(18.091f, 2.78f, 16.666f, 2.78f, 15.788f, 3.659f)
                lineTo(4.848f, 14.598f)
                curveTo(3.384f, 16.063f, 3.384f, 18.437f, 4.848f, 19.902f)
                curveTo(6.313f, 21.366f, 8.687f, 21.366f, 10.152f, 19.902f)
                lineTo(17.845f, 12.209f)
                curveTo(18.138f, 11.916f, 18.612f, 11.916f, 18.905f, 12.209f)
                curveTo(19.198f, 12.502f, 19.198f, 12.976f, 18.905f, 13.269f)
                lineTo(11.212f, 20.962f)
                curveTo(9.162f, 23.013f, 5.838f, 23.013f, 3.788f, 20.962f)
                curveTo(1.737f, 18.912f, 1.737f, 15.588f, 3.788f, 13.538f)
                lineTo(14.727f, 2.598f)
                curveTo(16.191f, 1.134f, 18.566f, 1.134f, 20.03f, 2.598f)
                curveTo(21.495f, 4.063f, 21.495f, 6.437f, 20.03f, 7.902f)
                lineTo(9.097f, 18.835f)
                curveTo(9.095f, 18.837f, 9.092f, 18.84f, 9.089f, 18.843f)
                lineTo(9.082f, 18.85f)
                lineTo(9.08f, 18.852f)
                lineTo(9.077f, 18.854f)
                curveTo(8.198f, 19.72f, 6.783f, 19.715f, 5.909f, 18.841f)
                curveTo(5.03f, 17.962f, 5.03f, 16.538f, 5.909f, 15.659f)
                lineTo(13.719f, 7.848f)
                curveTo(14.012f, 7.555f, 14.487f, 7.555f, 14.78f, 7.848f)
                curveTo(15.073f, 8.141f, 15.073f, 8.616f, 14.78f, 8.909f)
                lineTo(6.97f, 16.72f)
                curveTo(6.677f, 17.013f, 6.677f, 17.487f, 6.97f, 17.78f)
                curveTo(7.26f, 18.071f, 7.731f, 18.073f, 8.024f, 17.787f)
                lineTo(18.97f, 6.841f)
                curveTo(19.848f, 5.962f, 19.848f, 4.538f, 18.97f, 3.659f)
                close()
            }
        }
        .build()
        return _paperClip!!
    }

private var _paperClip: ImageVector? = null
