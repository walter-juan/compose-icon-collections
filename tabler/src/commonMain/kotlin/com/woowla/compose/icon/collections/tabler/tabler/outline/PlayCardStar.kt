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

public val OutlineGroup.PlayCardStar: ImageVector
    get() {
        if (_playCardStar != null) {
            return _playCardStar!!
        }
        _playCardStar = Builder(name = "PlayCardStar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 5.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 6.0f)
                horizontalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 18.0f)
                horizontalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.75f, 14.112f)
                lineToRelative(-1.63f, 0.853f)
                arcToRelative(0.294f, 0.294f, 0.0f, false, true, -0.425f, -0.307f)
                lineToRelative(0.31f, -1.808f)
                lineToRelative(-1.317f, -1.28f)
                arcToRelative(0.292f, 0.292f, 0.0f, false, true, 0.163f, -0.499f)
                lineToRelative(1.82f, -0.264f)
                lineToRelative(0.815f, -1.644f)
                arcToRelative(0.294f, 0.294f, 0.0f, false, true, 0.527f, 0.0f)
                lineToRelative(0.814f, 1.644f)
                lineToRelative(1.82f, 0.264f)
                arcToRelative(0.292f, 0.292f, 0.0f, false, true, 0.164f, 0.499f)
                lineToRelative(-1.318f, 1.28f)
                lineToRelative(0.31f, 1.807f)
                arcToRelative(0.292f, 0.292f, 0.0f, false, true, -0.425f, 0.308f)
                close()
            }
        }
        .build()
        return _playCardStar!!
    }

private var _playCardStar: ImageVector? = null
