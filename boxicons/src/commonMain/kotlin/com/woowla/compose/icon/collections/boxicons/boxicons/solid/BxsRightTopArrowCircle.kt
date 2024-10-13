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

public val SolidGroup.BxsRightTopArrowCircle: ImageVector
    get() {
        if (_bxsRightTopArrowCircle != null) {
            return _bxsRightTopArrowCircle!!
        }
        _bxsRightTopArrowCircle = Builder(name = "BxsRightTopArrowCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.071f, 4.929f)
                curveToRelative(-3.899f, -3.898f, -10.243f, -3.898f, -14.143f, 0.0f)
                curveToRelative(-3.898f, 3.899f, -3.898f, 10.244f, 0.0f, 14.143f)
                curveToRelative(3.899f, 3.898f, 10.243f, 3.898f, 14.143f, 0.0f)
                curveToRelative(3.899f, -3.9f, 3.899f, -10.244f, 0.0f, -14.143f)
                close()
                moveTo(15.535f, 15.536f)
                lineTo(12.707f, 12.707f)
                lineTo(9.172f, 16.243f)
                lineTo(7.758f, 14.829f)
                lineTo(11.293f, 11.293f)
                lineTo(8.465f, 8.464f)
                horizontalLineToRelative(7.07f)
                verticalLineToRelative(7.072f)
                close()
            }
        }
        .build()
        return _bxsRightTopArrowCircle!!
    }

private var _bxsRightTopArrowCircle: ImageVector? = null
