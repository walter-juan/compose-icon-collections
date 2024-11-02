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

public val Simpleicons.Hedera: ImageVector
    get() {
        if (_hedera != null) {
            return _hedera!!
        }
        _hedera = Builder(name = "Hedera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 0.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(16.957f, 17.396f)
                horizontalLineToRelative(-1.581f)
                lineTo(15.376f, 14.01f)
                lineTo(8.622f, 14.01f)
                verticalLineToRelative(3.378f)
                lineTo(7.05f, 17.388f)
                lineTo(7.05f, 6.604f)
                lineTo(8.631f, 6.604f)
                verticalLineToRelative(3.385f)
                horizontalLineToRelative(6.753f)
                lineTo(15.384f, 6.604f)
                horizontalLineToRelative(1.581f)
                close()
                moveTo(15.376f, 11.137f)
                lineTo(8.622f, 11.137f)
                verticalLineToRelative(1.724f)
                horizontalLineToRelative(6.753f)
                close()
            }
        }
        .build()
        return _hedera!!
    }

private var _hedera: ImageVector? = null
