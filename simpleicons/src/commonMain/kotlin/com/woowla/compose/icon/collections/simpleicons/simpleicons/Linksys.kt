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

public val Simpleicons.Linksys: ImageVector
    get() {
        if (_linksys != null) {
            return _linksys!!
        }
        _linksys = Builder(name = "Linksys", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.871f, 0.0f)
                curveToRelative(-1.702f, 0.0f, -3.082f, 1.38f, -3.082f, 3.082f)
                curveToRelative(0.0f, 1.702f, 1.38f, 3.08f, 3.082f, 3.082f)
                curveToRelative(1.703f, 0.0f, 3.082f, -1.38f, 3.082f, -3.082f)
                curveToRelative(0.0f, -1.702f, -1.38f, -3.082f, -3.082f, -3.082f)
                close()
                moveTo(1.047f, 0.488f)
                lineTo(1.047f, 24.0f)
                horizontalLineToRelative(21.31f)
                verticalLineToRelative(-3.469f)
                lineTo(5.166f, 20.531f)
                lineTo(5.166f, 0.488f)
                close()
                moveTo(8.203f, 0.488f)
                verticalLineToRelative(17.156f)
                horizontalLineToRelative(14.154f)
                verticalLineToRelative(-3.471f)
                horizontalLineToRelative(-10.039f)
                lineTo(12.318f, 0.488f)
                close()
            }
        }
        .build()
        return _linksys!!
    }

private var _linksys: ImageVector? = null
