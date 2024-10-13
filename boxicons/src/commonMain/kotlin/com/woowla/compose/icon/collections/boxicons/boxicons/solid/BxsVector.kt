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

public val SolidGroup.BxsVector: ImageVector
    get() {
        if (_bxsVector != null) {
            return _bxsVector!!
        }
        _bxsVector = Builder(name = "BxsVector", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.277f, 8.0f)
                curveToRelative(0.347f, 0.596f, 0.985f, 1.0f, 1.723f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                curveToRelative(-0.738f, 0.0f, -1.376f, 0.404f, -1.723f, 1.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(5.723f)
                curveTo(5.376f, 5.404f, 4.738f, 5.0f, 4.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                curveToRelative(0.738f, 0.0f, 1.376f, -0.404f, 1.723f, -1.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(0.368f)
                curveTo(5.134f, 9.839f, 4.319f, 12.534f, 4.092f, 14.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-0.877f)
                curveToRelative(0.197f, -0.959f, 0.718f, -2.406f, 2.085f, -3.418f)
                arcTo(0.984f, 0.984f, 0.0f, false, false, 9.0f, 11.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, false, 0.792f, -0.419f)
                curveToRelative(1.373f, 1.013f, 1.895f, 2.458f, 2.089f, 3.419f)
                horizontalLineTo(17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-1.092f)
                curveToRelative(-0.227f, -1.466f, -1.042f, -4.161f, -3.908f, -5.632f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(2.277f)
                close()
                moveTo(14.0f, 9.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _bxsVector!!
    }

private var _bxsVector: ImageVector? = null
