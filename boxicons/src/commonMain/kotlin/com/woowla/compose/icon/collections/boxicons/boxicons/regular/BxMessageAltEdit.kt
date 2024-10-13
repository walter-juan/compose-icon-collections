package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxMessageAltEdit: ImageVector
    get() {
        if (_bxMessageAltEdit != null) {
            return _bxMessageAltEdit!!
        }
        _bxMessageAltEdit = Builder(name = "BxMessageAltEdit", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.586f, 18.0f)
                lineTo(12.0f, 21.414f)
                lineTo(15.414f, 18.0f)
                horizontalLineTo(19.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(3.586f)
                close()
                moveTo(5.0f, 4.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-4.414f)
                lineTo(12.0f, 18.586f)
                lineTo(9.414f, 16.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.479f, 7.219f)
                lineToRelative(-4.977f, 4.969f)
                verticalLineToRelative(1.799f)
                horizontalLineToRelative(1.8f)
                lineToRelative(4.975f, -4.969f)
                close()
                moveTo(14.698f, 4.999f)
                lineTo(16.498f, 6.799f)
                lineTo(15.128f, 8.169f)
                lineTo(13.328f, 6.37f)
                close()
            }
        }
        .build()
        return _bxMessageAltEdit!!
    }

private var _bxMessageAltEdit: ImageVector? = null
