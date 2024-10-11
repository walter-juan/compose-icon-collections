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

public val OutlineGroup.PentagonMinus: ImageVector
    get() {
        if (_pentagonMinus != null) {
            return _pentagonMinus!!
        }
        _pentagonMinus = Builder(name = "PentagonMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5f, 21.0f)
                quadToRelative(-1.82f, 0.0f, -5.458f, 0.005f)
                arcToRelative(1.98f, 1.98f, 0.0f, false, true, -1.881f, -1.367f)
                lineToRelative(-3.064f, -9.43f)
                arcToRelative(1.98f, 1.98f, 0.0f, false, true, 0.719f, -2.212f)
                lineToRelative(8.021f, -5.828f)
                arcToRelative(1.98f, 1.98f, 0.0f, false, true, 2.326f, 0.0f)
                lineToRelative(8.021f, 5.828f)
                curveToRelative(0.694f, 0.504f, 0.984f, 1.397f, 0.719f, 2.212f)
                lineToRelative(-1.559f, 4.792f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 19.0f)
                horizontalLineToRelative(6.0f)
            }
        }
        .build()
        return _pentagonMinus!!
    }

private var _pentagonMinus: ImageVector? = null
