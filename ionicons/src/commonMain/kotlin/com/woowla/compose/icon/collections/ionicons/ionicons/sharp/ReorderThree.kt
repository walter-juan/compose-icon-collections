package com.woowla.compose.icon.collections.ionicons.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Square
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.SharpGroup

public val SharpGroup.ReorderThree: ImageVector
    get() {
        if (_reorderThree != null) {
            return _reorderThree!!
        }
        _reorderThree = Builder(name = "ReorderThree", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 44.0f, strokeLineCap = Square, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(102.0f, 256.0f)
                lineTo(410.0f, 256.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 44.0f, strokeLineCap = Square, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(102.0f, 176.0f)
                lineTo(410.0f, 176.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 44.0f, strokeLineCap = Square, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(102.0f, 336.0f)
                lineTo(410.0f, 336.0f)
            }
        }
        .build()
        return _reorderThree!!
    }

private var _reorderThree: ImageVector? = null
