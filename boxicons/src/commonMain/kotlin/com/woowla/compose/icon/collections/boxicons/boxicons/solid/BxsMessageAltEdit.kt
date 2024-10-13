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

public val SolidGroup.BxsMessageAltEdit: ImageVector
    get() {
        if (_bxsMessageAltEdit != null) {
            return _bxsMessageAltEdit!!
        }
        _bxsMessageAltEdit = Builder(name = "BxsMessageAltEdit", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(3.5f)
                lineToRelative(3.5f, 4.0f)
                lineToRelative(3.5f, -4.0f)
                lineTo(19.0f, 18.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(21.0f, 4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                lineTo(5.0f, 2.0f)
                close()
                moveTo(9.302f, 13.987f)
                horizontalLineToRelative(-1.8f)
                verticalLineToRelative(-1.799f)
                lineToRelative(4.978f, -4.97f)
                lineToRelative(1.798f, 1.799f)
                lineToRelative(-4.976f, 4.97f)
                close()
                moveTo(15.125f, 8.17f)
                lineTo(13.327f, 6.371f)
                lineTo(14.698f, 5.0f)
                lineToRelative(1.8f, 1.799f)
                lineToRelative(-1.373f, 1.371f)
                close()
            }
        }
        .build()
        return _bxsMessageAltEdit!!
    }

private var _bxsMessageAltEdit: ImageVector? = null
