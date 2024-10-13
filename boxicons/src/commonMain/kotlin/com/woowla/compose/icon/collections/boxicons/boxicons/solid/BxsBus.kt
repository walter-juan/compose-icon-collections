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

public val SolidGroup.BxsBus: ImageVector
    get() {
        if (_bxsBus != null) {
            return _bxsBus!!
        }
        _bxsBus = Builder(name = "BxsBus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.021f)
                curveToRelative(0.003f, -0.146f, -0.007f, -1.465f, -1.3f, -2.735f)
                curveTo(18.427f, 2.036f, 17.143f, 2.0f, 17.0f, 2.0f)
                lineTo(6.996f, 2.0f)
                curveToRelative(-0.239f, 0.0f, -1.493f, 0.063f, -2.708f, 1.302f)
                curveTo(3.036f, 4.578f, 3.0f, 5.859f, 3.0f, 6.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.734f, 0.406f, 1.373f, 1.0f, 1.721f)
                lineTo(4.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.277f)
                arcTo(1.99f, 1.99f, 0.0f, false, false, 21.0f, 18.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.0f)
                lineTo(22.0f, 9.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(21.0f, 6.021f)
                close()
                moveTo(9.0f, 4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 6.0f)
                lineTo(9.0f, 4.0f)
                close()
                moveTo(6.5f, 18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.001f, -3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 18.0f)
                close()
                moveTo(11.0f, 13.0f)
                lineTo(5.0f, 13.0f)
                lineTo(5.0f, 8.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(17.5f, 18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.001f, -3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.5f, 18.0f)
                close()
                moveTo(19.0f, 13.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(13.0f, 8.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _bxsBus!!
    }

private var _bxsBus: ImageVector? = null
