package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Libreofficewriter: ImageVector
    get() {
        if (_libreofficewriter != null) {
            return _libreofficewriter!!
        }
        _libreofficewriter = Builder(name = "Libreofficewriter", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 0.0f)
                verticalLineToRelative(7.0f)
                lineToRelative(-7.0f, -7.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(22.0f, 9.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.662f, -1.338f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-1.662f, 0.0f, -3.0f, -1.338f, -3.0f, -3.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -1.662f, 1.338f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(9.0f, 9.0f)
                close()
                moveTo(6.0f, 10.0f)
                horizontalLineToRelative(5.0f)
                lineTo(11.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(6.0f, 12.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 11.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(6.0f, 14.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 13.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(11.0f, 17.0f)
                lineTo(6.0f, 17.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(18.0f, 15.0f)
                lineTo(6.0f, 15.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(18.0f, 9.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(6.0f)
                lineTo(18.0f, 9.0f)
                close()
                moveTo(16.5f, 11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, -1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                close()
                moveTo(14.0f, 11.0f)
                lineToRelative(-1.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _libreofficewriter!!
    }

private var _libreofficewriter: ImageVector? = null
