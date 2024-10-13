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

public val SolidGroup.BxsPurchaseTag: ImageVector
    get() {
        if (_bxsPurchaseTag != null) {
            return _bxsPurchaseTag!!
        }
        _bxsPurchaseTag = Builder(name = "BxsPurchaseTag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.586f, 2.586f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.172f, 2.0f)
                horizontalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(7.172f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.586f, 1.414f)
                lineToRelative(8.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.828f, 0.0f)
                lineToRelative(7.172f, -7.172f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -2.828f)
                lineToRelative(-8.0f, -8.0f)
                close()
                moveTo(7.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.001f, -4.001f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 9.0f)
                close()
            }
        }
        .build()
        return _bxsPurchaseTag!!
    }

private var _bxsPurchaseTag: ImageVector? = null
