package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxDumbbell: ImageVector
    get() {
        if (_bxDumbbell != null) {
            return _bxDumbbell!!
        }
        _bxDumbbell = Builder(name = "BxDumbbell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.0f)
                lineTo(18.0f, 5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.0f)
                lineTo(9.0f, 11.0f)
                lineTo(9.0f, 5.0f)
                close()
                moveTo(3.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                lineTo(5.0f, 8.0f)
                lineTo(4.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(21.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(21.0f, 9.0f)
                close()
            }
        }
        .build()
        return _bxDumbbell!!
    }

private var _bxDumbbell: ImageVector? = null
