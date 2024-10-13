package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlMicrosoft: ImageVector
    get() {
        if (_bxlMicrosoft != null) {
            return _bxlMicrosoft!!
        }
        _bxlMicrosoft = Builder(name = "BxlMicrosoft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.55f, 21.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-8.55f)
                horizontalLineToRelative(8.55f)
                lineTo(11.55f, 21.0f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-8.55f)
                verticalLineToRelative(-8.55f)
                lineTo(21.0f, 12.45f)
                lineTo(21.0f, 21.0f)
                close()
                moveTo(11.55f, 11.55f)
                lineTo(3.0f, 11.55f)
                lineTo(3.0f, 3.0f)
                horizontalLineToRelative(8.55f)
                verticalLineToRelative(8.55f)
                close()
                moveTo(21.0f, 11.55f)
                horizontalLineToRelative(-8.55f)
                lineTo(12.45f, 3.0f)
                lineTo(21.0f, 3.0f)
                verticalLineToRelative(8.55f)
                close()
            }
        }
        .build()
        return _bxlMicrosoft!!
    }

private var _bxlMicrosoft: ImageVector? = null
