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

public val OutlineGroup.Invoice: ImageVector
    get() {
        if (_invoice != null) {
            return _invoice!!
        }
        _invoice = Builder(name = "Invoice", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 3.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 12.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.78f, 1.78f, 0.0f, false, true, -3.1f, 1.4f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, false, -2.6f, 0.0f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, true, -2.6f, 0.0f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, false, -2.6f, 0.0f)
                arcToRelative(1.78f, 1.78f, 0.0f, false, true, -3.1f, -1.4f)
                verticalLineToRelative(-14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(7.0f)
                lineToRelative(5.0f, 5.0f)
                verticalLineToRelative(4.25f)
            }
        }
        .build()
        return _invoice!!
    }

private var _invoice: ImageVector? = null
