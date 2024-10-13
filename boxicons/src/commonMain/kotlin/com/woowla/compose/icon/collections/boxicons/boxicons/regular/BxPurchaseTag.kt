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

public val RegularGroup.BxPurchaseTag: ImageVector
    get() {
        if (_bxPurchaseTag != null) {
            return _bxPurchaseTag!!
        }
        _bxPurchaseTag = Builder(name = "BxPurchaseTag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.707f, 3.293f)
                arcTo(0.996f, 0.996f, 0.0f, false, false, 13.0f, 3.0f)
                horizontalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.266f, 0.105f, 0.52f, 0.293f, 0.707f)
                lineToRelative(8.0f, 8.0f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, 1.414f, 0.0f)
                lineToRelative(9.0f, -9.0f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, 0.0f, -1.414f)
                lineToRelative(-8.0f, -8.0f)
                close()
                moveTo(12.0f, 19.586f)
                lineToRelative(-7.0f, -7.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(7.586f)
                lineToRelative(7.0f, 7.0f)
                lineTo(12.0f, 19.586f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.496f, 8.495f)
                moveToRelative(-1.505f, 0.0f)
                arcToRelative(1.505f, 1.505f, 0.0f, true, true, 3.01f, 0.0f)
                arcToRelative(1.505f, 1.505f, 0.0f, true, true, -3.01f, 0.0f)
            }
        }
        .build()
        return _bxPurchaseTag!!
    }

private var _bxPurchaseTag: ImageVector? = null
