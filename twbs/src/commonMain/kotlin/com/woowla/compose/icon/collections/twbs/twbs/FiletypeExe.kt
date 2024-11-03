package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.FiletypeExe: ImageVector
    get() {
        if (_filetypeExe != null) {
            return _filetypeExe!!
        }
        _filetypeExe = Builder(name = "FiletypeExe", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 4.5f)
                lineTo(14.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(13.0f, 4.5f)
                horizontalLineToRelative(-2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 3.0f)
                lineTo(9.5f, 1.0f)
                lineTo(4.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(9.0f)
                lineTo(2.0f, 11.0f)
                lineTo(2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(5.5f)
                close()
                moveTo(2.575f, 15.202f)
                lineTo(0.785f, 15.202f)
                verticalLineToRelative(-1.073f)
                lineTo(2.47f, 14.129f)
                verticalLineToRelative(-0.606f)
                lineTo(0.785f, 13.523f)
                verticalLineToRelative(-1.025f)
                horizontalLineToRelative(1.79f)
                verticalLineToRelative(-0.648f)
                lineTo(0.0f, 11.85f)
                verticalLineToRelative(3.999f)
                horizontalLineToRelative(2.575f)
                close()
                moveTo(6.31f, 11.85f)
                horizontalLineToRelative(-0.893f)
                lineToRelative(-0.823f, 1.439f)
                horizontalLineToRelative(-0.036f)
                lineToRelative(-0.832f, -1.439f)
                horizontalLineToRelative(-0.931f)
                lineToRelative(1.227f, 1.983f)
                lineToRelative(-1.239f, 2.016f)
                horizontalLineToRelative(0.861f)
                lineToRelative(0.853f, -1.415f)
                horizontalLineToRelative(0.035f)
                lineToRelative(0.85f, 1.415f)
                horizontalLineToRelative(0.908f)
                lineToRelative(-1.254f, -1.992f)
                close()
                moveTo(7.335f, 15.202f)
                horizontalLineToRelative(1.79f)
                verticalLineToRelative(0.647f)
                lineTo(6.548f, 15.849f)
                lineTo(6.548f, 11.85f)
                horizontalLineToRelative(2.576f)
                verticalLineToRelative(0.648f)
                horizontalLineToRelative(-1.79f)
                verticalLineToRelative(1.025f)
                horizontalLineToRelative(1.684f)
                verticalLineToRelative(0.606f)
                lineTo(7.334f, 14.129f)
                verticalLineToRelative(1.073f)
                close()
            }
        }
        .build()
        return _filetypeExe!!
    }

private var _filetypeExe: ImageVector? = null
