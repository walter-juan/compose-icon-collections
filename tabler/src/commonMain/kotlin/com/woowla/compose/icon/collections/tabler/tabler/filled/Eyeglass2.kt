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

public val FilledGroup.Eyeglass2: ImageVector
    get() {
        if (_eyeglass2 != null) {
            return _eyeglass2!!
        }
        _eyeglass2 = Builder(name = "Eyeglass2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                horizontalLineToRelative(-1.257f)
                lineToRelative(-2.24f, 7.467f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 6.24f, 2.533f)
                horizontalLineToRelative(2.513f)
                arcToRelative(4.502f, 4.502f, 0.0f, false, true, 6.241f, -2.534f)
                lineToRelative(-2.241f, -7.466f)
                horizontalLineToRelative(-1.256f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.958f, 0.713f)
                lineToRelative(3.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.042f, 0.287f)
                verticalLineToRelative(2.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -8.972f, 0.5f)
                horizontalLineToRelative(-2.056f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -8.972f, -0.5f)
                verticalLineToRelative(-2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.042f, -0.287f)
                lineToRelative(3.0f, -10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.958f, -0.713f)
                close()
            }
        }
        .build()
        return _eyeglass2!!
    }

private var _eyeglass2: ImageVector? = null
