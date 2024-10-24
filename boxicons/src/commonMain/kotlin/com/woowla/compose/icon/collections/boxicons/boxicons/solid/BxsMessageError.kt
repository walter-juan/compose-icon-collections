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

public val SolidGroup.BxsMessageError: ImageVector
    get() {
        if (_bxsMessageError != null) {
            return _bxsMessageError!!
        }
        _bxsMessageError = Builder(name = "BxsMessageError", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                lineTo(4.0f, 2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.894f, -2.0f, 1.992f)
                verticalLineToRelative(12.016f)
                curveTo(2.0f, 17.106f, 2.897f, 18.0f, 4.0f, 18.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(6.351f, -4.0f)
                lineTo(20.0f, 18.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.894f, 2.0f, -1.992f)
                lineTo(22.0f, 3.992f)
                arcTo(1.998f, 1.998f, 0.0f, false, false, 20.0f, 2.0f)
                close()
                moveTo(13.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _bxsMessageError!!
    }

private var _bxsMessageError: ImageVector? = null