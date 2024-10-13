package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsBed: ImageVector
    get() {
        if (_bxsBed != null) {
            return _bxsBed!!
        }
        _bxsBed = Builder(name = "BxsBed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 9.556f)
                lineTo(20.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 5.0f)
                lineTo(6.0f, 3.0f)
                lineTo(4.0f, 3.0f)
                verticalLineToRelative(6.557f)
                curveTo(2.81f, 10.25f, 2.0f, 11.526f, 2.0f, 13.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.474f, -0.811f, -2.75f, -2.0f, -3.444f)
                close()
                moveTo(11.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                lineTo(6.0f, 7.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 9.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(13.0f, 7.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _bxsBed!!
    }

private var _bxsBed: ImageVector? = null
