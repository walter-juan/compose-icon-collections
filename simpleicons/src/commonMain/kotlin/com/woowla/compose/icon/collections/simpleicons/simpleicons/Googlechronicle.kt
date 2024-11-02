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

public val Simpleicons.Googlechronicle: ImageVector
    get() {
        if (_googlechronicle != null) {
            return _googlechronicle!!
        }
        _googlechronicle = Builder(name = "Googlechronicle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.719f, 4.812f)
                lineToRelative(4.812f, 3.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(-4.812f, 3.0f)
                close()
                moveTo(2.719f, 14.812f)
                lineTo(7.531f, 11.812f)
                verticalLineToRelative(9.375f)
                lineToRelative(-3.914f, -2.389f)
                arcToRelative(1.875f, 1.875f, 0.0f, false, true, -0.898f, -1.6f)
                close()
                moveTo(2.719f, 0.0f)
                horizontalLineToRelative(18.562f)
                verticalLineToRelative(4.812f)
                lineTo(2.719f, 4.812f)
                close()
                moveTo(7.531f, 21.188f)
                lineTo(21.281f, 12.594f)
                verticalLineToRelative(4.618f)
                curveToRelative(0.0f, 0.626f, -0.323f, 1.208f, -0.854f, 1.539f)
                lineTo(12.0f, 24.0f)
                close()
            }
        }
        .build()
        return _googlechronicle!!
    }

private var _googlechronicle: ImageVector? = null
