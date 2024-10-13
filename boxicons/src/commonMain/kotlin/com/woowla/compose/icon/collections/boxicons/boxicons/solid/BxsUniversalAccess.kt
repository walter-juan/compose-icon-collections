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

public val SolidGroup.BxsUniversalAccess: ImageVector
    get() {
        if (_bxsUniversalAccess != null) {
            return _bxsUniversalAccess!!
        }
        _bxsUniversalAccess = Builder(name = "BxsUniversalAccess", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 5.33f)
                arcTo(1.67f, 1.67f, 0.0f, true, true, 10.33f, 7.0f)
                arcTo(1.67f, 1.67f, 0.0f, false, true, 12.0f, 5.33f)
                close()
                moveTo(15.33f, 17.83f)
                lineTo(13.67f, 18.67f)
                lineTo(12.28f, 14.78f)
                horizontalLineToRelative(-0.56f)
                lineToRelative(-1.39f, 3.89f)
                lineToRelative(-1.66f, -0.84f)
                lineToRelative(1.66f, -4.72f)
                verticalLineToRelative(-1.66f)
                lineTo(7.0f, 10.33f)
                lineToRelative(0.56f, -1.66f)
                lineToRelative(3.33f, 1.11f)
                horizontalLineToRelative(2.22f)
                lineToRelative(3.33f, -1.11f)
                lineToRelative(0.56f, 1.66f)
                lineToRelative(-3.33f, 1.12f)
                verticalLineToRelative(1.66f)
                close()
            }
        }
        .build()
        return _bxsUniversalAccess!!
    }

private var _bxsUniversalAccess: ImageVector? = null
