package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.PlayerTrackNext: ImageVector
    get() {
        if (_playerTrackNext != null) {
            return _playerTrackNext!!
        }
        _playerTrackNext = Builder(name = "PlayerTrackNext", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 0.86f, 1.012f, 1.318f, 1.659f, 0.753f)
                lineToRelative(8.0f, -7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.506f)
                lineToRelative(-8.0f, -7.0f)
                curveToRelative(-0.647f, -0.565f, -1.659f, -0.106f, -1.659f, 0.753f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 0.86f, 1.012f, 1.318f, 1.659f, 0.753f)
                lineToRelative(8.0f, -7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.506f)
                lineToRelative(-8.0f, -7.0f)
                curveToRelative(-0.647f, -0.565f, -1.659f, -0.106f, -1.659f, 0.753f)
                close()
            }
        }
        .build()
        return _playerTrackNext!!
    }

private var _playerTrackNext: ImageVector? = null
