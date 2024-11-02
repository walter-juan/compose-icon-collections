package com.woowla.compose.icon.collections.ionicons.ionicons.outline

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
import com.woowla.compose.icon.collections.ionicons.ionicons.OutlineGroup

public val OutlineGroup.TrendingUp: ImageVector
    get() {
        if (_trendingUp != null) {
            return _trendingUp!!
        }
        _trendingUp = Builder(name = "TrendingUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(352.0f, 144.0f)
                lineToRelative(112.0f, 0.0f)
                lineToRelative(0.0f, 112.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.0f, 368.0f)
                lineTo(169.37f, 246.63f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 45.26f, 0.0f)
                lineToRelative(50.74f, 50.74f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 45.26f, 0.0f)
                lineTo(448.0f, 160.0f)
            }
        }
        .build()
        return _trendingUp!!
    }

private var _trendingUp: ImageVector? = null
