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

public val RegularGroup.BxPlusMedical: ImageVector
    get() {
        if (_bxPlusMedical != null) {
            return _bxPlusMedical!!
        }
        _bxPlusMedical = Builder(name = "BxPlusMedical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.013f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(6.987f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(7.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
        }
        .build()
        return _bxPlusMedical!!
    }

private var _bxPlusMedical: ImageVector? = null
