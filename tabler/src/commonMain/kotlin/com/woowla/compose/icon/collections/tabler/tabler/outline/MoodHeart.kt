package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup

public val OutlineGroup.MoodHeart: ImageVector
    get() {
        if (_moodHeart != null) {
            return _moodHeart!!
        }
        _moodHeart = Builder(name = "MoodHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 12.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, -8.012f, 8.946f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 10.0f)
                horizontalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 10.0f)
                horizontalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 15.0f)
                arcToRelative(3.59f, 3.59f, 0.0f, false, false, 2.774f, 0.99f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.994f, 21.5f)
                lineToRelative(2.518f, -2.58f)
                arcToRelative(1.74f, 1.74f, 0.0f, false, false, 0.004f, -2.413f)
                arcToRelative(1.627f, 1.627f, 0.0f, false, false, -2.346f, -0.005f)
                lineToRelative(-0.168f, 0.172f)
                lineToRelative(-0.168f, -0.172f)
                arcToRelative(1.627f, 1.627f, 0.0f, false, false, -2.346f, -0.004f)
                arcToRelative(1.74f, 1.74f, 0.0f, false, false, -0.004f, 2.412f)
                lineToRelative(2.51f, 2.59f)
                close()
            }
        }
        .build()
        return _moodHeart!!
    }

private var _moodHeart: ImageVector? = null
