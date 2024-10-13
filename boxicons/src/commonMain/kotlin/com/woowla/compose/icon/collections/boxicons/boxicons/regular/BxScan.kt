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

public val RegularGroup.BxScan: ImageVector
    get() {
        if (_bxScan != null) {
            return _bxScan!!
        }
        _bxScan = Builder(name = "BxScan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(5.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                lineTo(9.0f, 3.0f)
                lineTo(4.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                close()
                moveTo(21.0f, 9.0f)
                lineTo(21.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 19.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(9.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                lineTo(5.0f, 19.0f)
                verticalLineToRelative(-4.0f)
                lineTo(3.0f, 15.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(2.0f, 11.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 13.0f)
                close()
            }
        }
        .build()
        return _bxScan!!
    }

private var _bxScan: ImageVector? = null
