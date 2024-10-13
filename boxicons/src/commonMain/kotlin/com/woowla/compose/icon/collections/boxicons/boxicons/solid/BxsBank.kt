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

public val SolidGroup.BxsBank: ImageVector
    get() {
        if (_bxsBank != null) {
            return _bxsBank!!
        }
        _bxsBank = Builder(name = "BxsBank", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 8.0f)
                verticalLineToRelative(4.001f)
                horizontalLineToRelative(1.0f)
                lineTo(3.0f, 18.0f)
                lineTo(2.0f, 18.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(16.0f)
                lineToRelative(3.0f, 0.001f)
                lineTo(21.0f, 21.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.999f)
                horizontalLineToRelative(1.0f)
                lineTo(22.0f, 8.0f)
                lineTo(12.0f, 2.0f)
                lineTo(2.0f, 8.0f)
                close()
                moveTo(6.0f, 18.0f)
                verticalLineToRelative(-5.999f)
                horizontalLineToRelative(2.0f)
                lineTo(8.0f, 18.0f)
                lineTo(6.0f, 18.0f)
                close()
                moveTo(11.0f, 18.0f)
                verticalLineToRelative(-5.999f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(18.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.999f)
                horizontalLineToRelative(2.0f)
                lineTo(18.0f, 18.0f)
                close()
                moveTo(14.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.001f, -0.001f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 8.0f)
                close()
            }
        }
        .build()
        return _bxsBank!!
    }

private var _bxsBank: ImageVector? = null
