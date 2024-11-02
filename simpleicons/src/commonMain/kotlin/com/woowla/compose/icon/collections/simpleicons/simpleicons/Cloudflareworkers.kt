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

public val Simpleicons.Cloudflareworkers: ImageVector
    get() {
        if (_cloudflareworkers != null) {
            return _cloudflareworkers!!
        }
        _cloudflareworkers = Builder(name = "Cloudflareworkers", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.213f, 0.063f)
                lineToRelative(8.879f, 12.136f)
                lineToRelative(-8.67f, 11.739f)
                horizontalLineToRelative(2.476f)
                lineToRelative(8.665f, -11.735f)
                lineToRelative(-8.89f, -12.14f)
                close()
                moveTo(12.941f, 0.063f)
                lineTo(21.961f, 12.055f)
                lineTo(12.943f, 23.938f)
                horizontalLineToRelative(2.496f)
                lineTo(24.0f, 12.656f)
                verticalLineToRelative(-1.199f)
                lineTo(15.434f, 0.063f)
                close()
                moveTo(7.178f, 2.02f)
                lineTo(0.01f, 11.398f)
                lineToRelative(-0.01f, 1.2f)
                lineToRelative(7.203f, 9.644f)
                lineToRelative(1.238f, -1.676f)
                lineToRelative(-6.396f, -8.556f)
                lineToRelative(6.361f, -8.313f)
                close()
            }
        }
        .build()
        return _cloudflareworkers!!
    }

private var _cloudflareworkers: ImageVector? = null
