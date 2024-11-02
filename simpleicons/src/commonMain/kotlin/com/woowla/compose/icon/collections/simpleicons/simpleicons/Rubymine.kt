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

public val Simpleicons.Rubymine: ImageVector
    get() {
        if (_rubymine != null) {
            return _rubymine!!
        }
        _rubymine = Builder(name = "Rubymine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(3.056f, 3.0f)
                lineTo(6.92f, 3.0f)
                quadToRelative(0.945f, 0.0f, 1.665f, 0.347f)
                reflectiveQuadToRelative(1.106f, 0.977f)
                curveToRelative(0.262f, 0.42f, 0.392f, 0.902f, 0.392f, 1.46f)
                quadToRelative(0.0f, 0.835f, -0.399f, 1.478f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, -1.125f, 0.99f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.297f, 0.103f)
                quadToRelative(-0.066f, 0.02f, -0.13f, 0.04f)
                lineTo(10.276f, 12.0f)
                lineTo(8.264f, 12.0f)
                lineToRelative(-1.94f, -3.4f)
                lineTo(4.811f, 8.6f)
                lineTo(4.811f, 12.0f)
                lineTo(3.056f, 12.0f)
                close()
                moveTo(11.566f, 3.0f)
                horizontalLineToRelative(2.444f)
                lineToRelative(1.851f, 5.907f)
                lineToRelative(0.154f, 0.773f)
                lineToRelative(0.136f, -0.773f)
                lineTo(17.937f, 3.0f)
                horizontalLineToRelative(2.482f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-1.736f)
                lineTo(18.683f, 5.578f)
                lineToRelative(0.026f, -0.47f)
                lineTo(16.613f, 12.0f)
                lineTo(15.34f, 12.0f)
                lineToRelative(-2.07f, -6.846f)
                lineToRelative(0.026f, 0.424f)
                lineTo(13.296f, 12.0f)
                horizontalLineToRelative(-1.73f)
                close()
                moveTo(4.812f, 4.459f)
                lineTo(4.812f, 7.14f)
                horizontalLineToRelative(1.993f)
                quadToRelative(0.444f, -0.001f, 0.771f, -0.161f)
                quadToRelative(0.335f, -0.167f, 0.515f, -0.47f)
                curveToRelative(0.12f, -0.205f, 0.18f, -0.439f, 0.18f, -0.713f)
                quadToRelative(0.0f, -0.411f, -0.18f, -0.707f)
                arcToRelative(1.17f, 1.17f, 0.0f, false, false, -0.515f, -0.462f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, -0.77f, -0.168f)
                close()
                moveTo(2.996f, 19.2f)
                horizontalLineToRelative(9.6f)
                lineTo(12.596f, 21.0f)
                horizontalLineToRelative(-9.6f)
                close()
            }
        }
        .build()
        return _rubymine!!
    }

private var _rubymine: ImageVector? = null
