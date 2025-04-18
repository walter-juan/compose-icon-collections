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

public val RegularGroup.BxTransferAlt: ImageVector
    get() {
        if (_bxTransferAlt != null) {
            return _bxTransferAlt!!
        }
        _bxTransferAlt = Builder(name = "BxTransferAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.924f, 10.383f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.217f, -1.09f)
                lineToRelative(-5.0f, -5.0f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(16.586f, 9.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.924f, -0.617f)
                close()
                moveTo(4.076f, 13.617f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.217f, 1.09f)
                lineToRelative(5.0f, 5.0f)
                lineToRelative(1.414f, -1.414f)
                lineTo(7.414f, 15.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(5.0f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, -0.924f, 0.617f)
                close()
            }
        }
        .build()
        return _bxTransferAlt!!
    }

private var _bxTransferAlt: ImageVector? = null
