package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.FileSettings: ImageVector
    get() {
        if (_fileSettings != null) {
            return _fileSettings!!
        }
        _fileSettings = Builder(name = "FileSettings", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineToRelative(0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.876f, 0.876f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(4.0f)
                lineToRelative(0.005f, 0.15f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.838f, 1.844f)
                lineToRelative(0.157f, 0.006f)
                horizontalLineToRelative(4.0f)
                lineToRelative(0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.876f, 0.876f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.824f, 2.995f)
                lineToRelative(-0.176f, 0.005f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.995f, -2.824f)
                lineToRelative(-0.005f, -0.176f)
                verticalLineToRelative(-14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.824f, -2.995f)
                lineToRelative(0.176f, -0.005f)
                close()
                moveTo(12.0f, 10.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(0.67f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.909f, 0.516f)
                lineToRelative(-0.576f, -0.346f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.03f, 1.714f)
                lineToRelative(0.575f, 0.346f)
                quadToRelative(-0.043f, 0.207f, -0.055f, 0.424f)
                lineToRelative(-0.005f, 0.176f)
                quadToRelative(0.0f, 0.28f, 0.05f, 0.548f)
                lineToRelative(-0.582f, 0.336f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.732f)
                lineToRelative(0.583f, -0.336f)
                curveToRelative(0.277f, 0.238f, 0.598f, 0.425f, 0.95f, 0.55f)
                lineToRelative(-0.001f, 0.67f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineToRelative(-0.671f)
                curveToRelative(0.335f, -0.118f, 0.641f, -0.294f, 0.909f, -0.514f)
                lineToRelative(0.576f, 0.345f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.03f, -1.714f)
                lineToRelative(-0.575f, -0.346f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.01f, -1.148f)
                lineToRelative(0.581f, -0.336f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.732f)
                lineToRelative(-0.582f, 0.335f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.948f, -0.548f)
                lineToRelative(-0.001f, -0.671f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                moveToRelative(0.0f, 3.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 7.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(-0.001f, -4.001f)
                close()
            }
        }
        .build()
        return _fileSettings!!
    }

private var _fileSettings: ImageVector? = null
